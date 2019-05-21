package season_4.Circle_Cylinder.Triangle;

public class Shape {
        private String color;
        private Boolean filled;

        public Shape(){};
        public Shape(String color){
            this.color = color;
        };
        public Shape(String color, Boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Boolean isFilled() {
            return filled;
        }

        public void setFilled(Boolean filled) {
            this.filled = filled;
        }


        @Override
        public String toString(){
            return "A Shape width color of "+getColor();
        }

}
