public class Sign {
    private String text = "";
    private int width = 0;
    private int count = 1;
    public Sign(String text, int width) {
        String temp = text;
        this.width = width;
        if (!(text.length() <= width)) {
            for (int i = 0; i <= temp.length() - 1; i += width) {
                count++;
                if (i + width < temp.length()) this.text += text.substring(i, i + width) + ";";
                else this.text += text.substring(i);
            }
            count--;
        } else this.text = text;
    }
    public String getLines(){
        if (text.isBlank()) return "null";
        return text;
    }
    public int numberOfLines(){
        if (!text.isEmpty()) return count;
        return 0;
    }
}

