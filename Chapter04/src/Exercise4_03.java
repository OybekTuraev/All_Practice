public class Exercise4_03 {
    public static void main(String[] args) {

        // Geography: estimate areas

        final double RADIUS = 6371.01;

        double x1_atlanta = 33.748997;
        double y1_atlanta = -84.387985;

        double x1_orlando = 28.538336;
        double y1_orlando = -81.379234;

        double x1_savannah = 32.080898;
        double y1_savannah = -81.091202;

        double x1_charlotte = 35.223789;
        double y1_charlotte = -80.841141;

        // Two triangles, first At-Sa-Cha, second At-Or-Sa

        // first triangle, Atl-Sav-Char

        double tr1_side1 = RADIUS * Math.acos(Math.sin(x1_atlanta) * Math.sin(x1_savannah) +
                Math.cos(x1_atlanta) * Math.cos(x1_savannah) * Math.cos(y1_atlanta - y1_savannah));

        double tr1_side2 = RADIUS * Math.acos(Math.sin(x1_savannah) * Math.sin(x1_charlotte) +
                Math.cos(x1_savannah) * Math.cos(x1_charlotte) * Math.cos(y1_savannah - y1_charlotte));

        double tr1_side3 = RADIUS * Math.acos(Math.sin(x1_charlotte) * Math.sin(x1_atlanta) +
                Math.cos(x1_charlotte) * Math.cos(x1_atlanta) * Math.cos(y1_charlotte - y1_atlanta));


        // second triangle, Atl-Orl-Sav

        double tr2_side1 = RADIUS * Math.acos(Math.sin(x1_atlanta) * Math.sin(x1_orlando) +
                Math.cos(x1_atlanta) * Math.cos(x1_orlando) * Math.cos(y1_atlanta - y1_orlando));

        double tr2_side2 = RADIUS * Math.acos(Math.sin(x1_orlando) * Math.sin(x1_savannah) +
                Math.cos(x1_orlando) * Math.cos(x1_savannah) * Math.cos(y1_orlando - y1_savannah));

        double tr2_side3 = RADIUS * Math.acos(Math.sin(x1_savannah) * Math.sin(x1_atlanta) +
                Math.cos(x1_savannah) * Math.cos(x1_atlanta) * Math.cos(y1_savannah - y1_atlanta));

        // check whether a triangle sides can be or not

        double s1 = 0;
        double s2 = 0;

        if (tr1_side1 + tr1_side2 > tr1_side3 && tr1_side2 + tr1_side3 > tr1_side1
                && tr1_side1 + tr1_side3 > tr1_side2){
            s1 = tr1_side1 + tr1_side2 + tr1_side3;
        }

        if (tr2_side1 + tr2_side2 > tr2_side3 && tr2_side2 + tr2_side3 > tr2_side1
                && tr2_side1 + tr2_side3 > tr2_side2){
            s2 = tr2_side1 + tr2_side2 + tr2_side3;
        }

        // Compute the area with 2.19 formula

        double area1 = Math.sqrt(s1 * (s1 - tr1_side1) * (s1 - tr1_side2) * (s1 - tr1_side3));
        double area2 = Math.sqrt(s2 * (s2 - tr2_side1) * (s2 - tr2_side2) * (s2 - tr2_side3));
        double total_area = area1 + area2;

        System.out.printf("The enclosed area is %f%n", total_area);
    }
}
