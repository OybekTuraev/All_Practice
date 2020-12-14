import processing.core.PApplet;

public class G14 extends PApplet {

                            //****        Random Stars       ****//

    final int COUNT = 120;

    final float MIN_DX = -2;
    final float MAX_DX = 2;

    final float MIN_DY = -2;
    final float MAX_DY = 2;

    final float MIN_RADIUS = 10;
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

        // Assign Values
        for (int i = 0; i < COUNT; i++){
            xs[i] = random(width);
            ys[i] = random(height);
            dxs[i] = random(MIN_DX, MAX_DX);
            dys[i] = random(MIN_DY, MAX_DY);
            radii[i] = random(MIN_RADIUS, MAX_RADIUS);
            angles[i] = 0;
            deltaAngles[i] = 0.02f;
        }
    }

    public void draw(){
        background(0);

        //Rotate and Draw
        for (int i = 0; i < COUNT; i++){
            stroke(random(0, 255), random(0, 255), random(0, 255));

            float radius1 = radii[i];
            float radius2 = radii[i] * 0.9f;
            float angle = angles[i];

            pushMatrix();
            translate(xs[i], ys[i]);
            rotate(angles[i]);
            angles[i] += deltaAngles[i];
            snowflake(8, 0, 0, radius1, radius2, angle);
            popMatrix();

            //Moving the Stars
            xs[i] += dxs[i];
            ys[i] += dys[i];

            if (xs[i] < radii[i]){
                xs[i] = 2 * radii[i] - xs[i];
                dxs[i] = -dxs[i];
                deltaAngles[i] = -deltaAngles[i];
            }

            if (xs[i] + radii[i] > width){
                xs[i] = 2 * width - xs[i] - 2 * radii[i];
                dxs[i] = -dxs[i];
                deltaAngles[i] = -deltaAngles[i];
            }

            if (ys[i] < radii[i]){
                ys[i] = 2 * radii[i] - ys[i];
                dys[i] = -dys[i];
                deltaAngles[i] = -deltaAngles[i];
            }

            if (ys[i] + radii[i] > height){
                ys[i] = 2 * height - ys[i] - 2 * radii[i];
                dys[i] = -dys[i];
                deltaAngles[i] = -deltaAngles[i];
            }
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

        PApplet.main("G14");
    }
}
