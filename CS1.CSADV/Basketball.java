public class Basketball{

    private String color;
    private String material;
    private double size;
    private String brand;

    public Basketball(){
        color = "Orange";
        material = "Leather";
        size = 29.5;
        brand = "Spalding";
    }

    public Basketball(String theBrand, String theColor, String theMaterial, double theSize){
        color = theColor;
        brand = theBrand;
        material = theMaterial;
        size = theSize;
    }

    public String toString(){
        String str = "Brand:"+brand+"\n"+"Color:"+color+"\n"+"Material"+material+"\n"+"Size:"+size;
        return str;
    }
}