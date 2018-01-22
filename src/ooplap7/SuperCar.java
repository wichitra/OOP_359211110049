package ooplap7;

public class SuperCar {

        private String  carbrand ;
        private String carcolor;
        private String carenginesize;
        private String maxspeed;
        private String countryoforigin;
    //contructor
    //defalt
    public SuperCar(){}
    public SuperCar(String br, String cl, String s, String m,String r) {
        this.carbrand = br;
        this.carcolor = cl;
        this.carenginesize = s;
        this.maxspeed = m;
        this.countryoforigin = r;


    } //contructor

    //getter and setter method
    //id
    //getter and setter method
    //id
    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }//setcarbrand

    public String getCarbrand() {
        return this.carbrand;
    }//getcarbrand

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }//setcarcolor

    public String getCarcolor() {
        return this.carcolor;
    }//getcarcolor

    public void setCarenginesize(String carenginesize) {
        this.carenginesize = carenginesize;
    }//setcarenginesize

    public String getCarenginesize() {
        return this.carenginesize;
    }//getcarenginesize

    public void setMaxspeed(String group) {
        this.maxspeed = maxspeed;
    }//setmaxspeed

    public String getMaxspeed() {
        return this.maxspeed;
    }//getmaxspeed

    public void setcountryoforigin(String countryoforigin) {
        this.countryoforigin = countryoforigin;
    }//setcountryoforigin

    public String getcountryoforigin() {
        return this.countryoforigin;
    }//getcountryoforigin


}//class
