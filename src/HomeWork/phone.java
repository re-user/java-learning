package HomeWork;

public class phone {

        private String brand;
        private double price;
        private String color;


        public  void call() {
            System.out.println("正在用价格为" + price + "的" + brand + "品牌颜色为" + color + "的手机");
        }

        public void sendMessage() {
            System.out.println("正在用价格为" + price + "的" + brand + "品牌颜色为" + color + "的手机发送短信");
        }

        public phone() {
        }

        public  phone(String brand, double price, String color) {
            this.brand = brand;
            this.price = price;
            this.color = color;
        }

        public void  setbrand(String brand) {
            this.brand = brand;
        }


        public String getbrand() {
            return brand;
        }

        public void setprice(double price) {
            this.price = price;
        }

        public double getprice() {
            return price ;
        }

        public void setcolor(String color) {
            this.color = color;
        }

        public String getcolor() {
            return color;
        }

    }

