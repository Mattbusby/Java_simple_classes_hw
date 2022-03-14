public class Printer {
    public int sheets;
    public int toner;

    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public int print(int pages, int copies){
        if (sheets >= (pages*copies)){
            sheets -= (pages*copies);
            toner -= (pages*copies);
            return sheets;
        }
        return sheets;
    }
}
