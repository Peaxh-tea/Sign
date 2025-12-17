public class Sign {
    private String text = "";
    private int width = 0;
    private int count = 1;
    public Sign(String text, int width) {
        this.text = text;
        this.width = width;
        while (count <= text.length()) {
            if (text.substring(count - 1, count).compareTo(text.substring(count, count + 1)) <= 25)
        }
        String[] lines = new String[count];
        if (!this.text.isEmpty()) {
            for (int i = 0; i < this.text.length(); i += width)
                lines[i] = this.text.substring(i, i + width);
        }
    }
    public String getLines(){
        String temp = "";
        if (text.isEmpty()) return null;
        for(int i = 0; i <= count; i++){
            temp = text
        }
    }
    public int numberOfLine(){
        if (!text.isEmpty()) return count;
        return 0;
    }
}

