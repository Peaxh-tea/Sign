public class Sign {
    private String text = "";
    private int width = 0;
    public Sign(String text, int width) {
        this.text = text;
        this.width = width;
        for (int i = 0; i < text.length(); i+=width) {
            String[] lines = text.substring(i,i + width);
        }
    }
    public int getLines(){
        return lines.length();
    }
}
