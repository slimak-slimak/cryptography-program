public class ApplicationArguments {
    private String mode = "enc";
    private String in = null;
    private String out = null;
    private int key = 0;
    private String data = "";
    private String precessedData;
    private String alg = "shift";

    public ApplicationArguments(String[] args) {
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-mode":
                    mode = args[++i];
                    break;
                case "-key":
                    key = Integer.parseInt(args[++i]);
                    break;
                case "-data":
                    data = args[++i];
                    break;
                case "-in":
                    in = args[++i];
                    break;
                case "-out":
                    out = args[++i];
                    break;
                case "-alg":
                   alg = args[++i];

                    break;
            }
        }
    }

    public boolean outExist(){
        if (out != null){
            return true;
        }
        else return false;
    }
    public boolean inExist(){
        if (in != null){
            return true;
        }
        else return false;
    }

    public String getMode() {
        return mode;
    }

    public String getIn() {
        return in;
    }

    public String getOut() {
        return out;
    }

    public int getKey() {
        return key;
    }

    public String getData() {
        return data;
    }

    public String getAlg() {
        return alg;
    }

    public String getPrecessedData() {
        return precessedData;
    }

    public void setPrecessedData(String precessedData) {
        this.precessedData = precessedData;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean performEncryption(){
        return "enc".equals(mode);
    }
}