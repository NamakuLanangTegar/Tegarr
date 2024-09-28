public class CD extends Product {
    private String artist;
    private int totalSong;
    private String label;

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTotalSong() {
        return this.totalSong;
    }

    public void setTotalSong(int totalSong) {
        this.totalSong = totalSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CD() {
            
        super();
        artist = "Hyo";
        totalSong = 17;
        label = "Sony Music";
    }

    public CD(int number, String name, int quantity, double price, String artist, int totalSong, String label) {
        super(number, name, quantity, price);
        this.artist = artist;
        this.totalSong = totalSong;
        this.label = label;
    }
    
    @Override
    public void print() {
        super.print();
        System.out.println("Artist: "+ artist);
        System.out.println("Total song: "+ totalSong);
        System.out.println("Label: "+ label);
    }
}
