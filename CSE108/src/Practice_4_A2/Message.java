package Practice_4_A2;

public class Message {
    private String To;
    private String From;
    private String Text;

    Message(String To, String From, String Text){
        this.To = To;
        this.From = From;
        this.Text = Text;
    }

    public String getFrom() {
        return From;
    }

    public String getText() {
        return Text;
    }

    public String getTo() {
        return To;
    }

    public void setFrom(String from) {
        From = from;
    }

    public void setText(String text) {
        Text = text;
    }

    public void setTo(String to) {
        To = to;
    }
}
