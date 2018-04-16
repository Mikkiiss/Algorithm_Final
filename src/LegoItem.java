public class LegoItem implements Comparable<LegoItem> {

    private String item_number;
    private String name;
    private int year;
    private String theme;
    private String subtheme;
    private int pieces;
    private int minifigures;
    private String image_url;
    private float gbp_msrp;
    private float usd_msrp;
    private float cad_msrp;
    private float eur_msrp;
    private String packaging;
    private String availability;

    public LegoItem(String item_number, String name, String year, String theme, String subtheme, String pieces, String minifigures,
                    String image_url, String gbp_msrp, String usd_msrp, String cad_msrp, String eur_msrp, String packaging,
                    String availability){

        this.item_number = item_number;
        this.name = name;
        this.year = Integer.parseInt(year);
        this.theme = theme;
        this.subtheme = subtheme;
        //If there are no pieces assign 0
        this.pieces = (("NA".equals(pieces)) ? 0 : Integer.parseInt(pieces));;
        //If there are no minifigures assign 0
        this.minifigures = (("NA".equals(minifigures)) ? 0 : Integer.parseInt(minifigures));;
        this.image_url = image_url;
        //If there are no set msrp assign 0
        this.gbp_msrp = (("NA".equals(gbp_msrp)) ? 0 : Float.parseFloat(gbp_msrp));
        this.usd_msrp = (("NA".equals(usd_msrp)) ? 0 : Float.parseFloat(usd_msrp));
        this.cad_msrp = (("NA".equals(cad_msrp)) ? 0 : Float.parseFloat(cad_msrp));
        this.eur_msrp = (("NA".equals(eur_msrp)) ? 0 : Float.parseFloat(eur_msrp));
        this.packaging = packaging;
        this.availability = availability;
    }

    //CompareTo method for Lego Items that compares them on the basis of amount of pieces
    public int compareTo(LegoItem item){
        //If the item has more pieces return 1
        if(this.getPieces() > item.getPieces()){
            return 1;
        }
        //If the item has less pieces return -1
        else if (this.getPieces() < item.getPieces()){
            return -1;
        }
        //If the item has the same amount of pieces return 0
        else{
            return 0;
        }
    }

    public String getItem_number() {
        return item_number;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getTheme() {
        return theme;
    }

    public String getSubtheme() {
        return subtheme;
    }

    public int getPieces() {
        return pieces;
    }

    public int getMinifigures() {
        return minifigures;
    }

    public String getImage_url() {
        return image_url;
    }

    public float getGbp_msrp() {
        return gbp_msrp;
    }

    public float getUsd_msrp() {
        return usd_msrp;
    }

    public float getCad_msrp() {
        return cad_msrp;
    }

    public float getEur_msrp() {
        return eur_msrp;
    }

    public String getPackaging() {
        return packaging;
    }

    public String getAvailability() {
        return availability;
    }
}