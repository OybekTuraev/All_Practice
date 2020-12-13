import processing.core.PApplet;

public class G15 extends PApplet {
    final int COUNT = 200;

    final float START_Y_MIN = -1000;
    final float START_Y_MAX = -100;

    final float MIN_DY = 5;
    final float MAX_DY = 20;

    final float MIN_DELTA_ANGLE = 0.1f;
    final float MAX_DELTA_ANGLE = 0.1f;

    final float MIN_RADIUS = 5;
    final float MAX_RADIUS = 20;

    float[] xs = new float[COUNT];
    float[] ys = new float[COUNT];
    float[] dxs = new float[COUNT];
    float[] dys = new float[COUNT];
    float[] radii = new float[COUNT];
    float[] angles = new float[COUNT];
    float[] deltaAngles = new float[COUNT];

    public void settings(){
        fullScreen();
    }

    public void setup(){
        background(0);
        strokeWeight(3);

        for (int i = 0; i < COUNT; i++){
            xs[i] = random(width);
            ys[i] = random(START_Y_MIN, START_Y_MAX);
            dxs[i] = 0;
            dys[i] = random(MIN_DY, MAX_DY);
            radii[i] = random(MIN_RADIUS, MAX_RADIUS);
            angles[i] = random(TWO_PI);
            deltaAngles[i] = random(MIN_DELTA_ANGLE, MAX_DELTA_ANGLE);
            if (deltaAngles[i] == 0){
                deltaAngles[i] = 0.01f;
            }
        }
    }

    public void draw(){
        background(0);
        for (int i = 0; i < COUNT; i++){
            stroke(255);
            /*stroke(random(0, 255), random(0, 255), random(0, 255)); // TODO*/

            float x = xs[i];
            float y = ys[i];
            float radius1 = radii[i];
            float radius2 = radii[i] * 0.7f;
            float angle = angles[i];

            snowflake(8, x, y, radius1, radius2, angle);

            float dy = dys[i];
            y += dy;

            if (y - radius1 > height) {
                y = random(START_Y_MIN, START_Y_MAX); // starting from the beginning again
            }

            ys[i] = y;

            float deltaAngle = deltaAngles[i];
            angle += deltaAngle;
            angles[i] = angle;
        }
    }

    public void snowflake(int rays, float x, float y, float radius1, float radius2, float angle){

        float angleStep = TWO_PI / rays;

        for (int i = 0; i < rays; i++){

            float radius = (i % 2 == 0) ? radius2 : radius1;
            float endX = x + cos(angle) * radius;
            float endY = y + sin(angle) * radius;

            line(x, y, endX, endY);

            angle += angleStep;
        }
    }

    public static void main(String[] args) {

        PApplet.main("G15");
    }
}
