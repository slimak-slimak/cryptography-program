public class UnicodeAlgorithm implements AlgorithmStrategy {

    private String perform (String data, String mode,int key){
        if (mode.equals("enc")){
            StringBuilder sb = new StringBuilder();
            for (char c : data.toCharArray()) {
                sb.append((char)(c + (key %26)));
            }

            return sb.toString();
        }
        else if(mode.equals("dec")){
            StringBuilder sb = new StringBuilder();
            for (char c : data.toCharArray()) {
                sb.append((char)(c - (key %26)));
            }
            return sb.toString();
        }
        else {return "No such mode";}
    }



    @Override
    public String encrypt(String data,String mode, int key) {
        return perform(data,mode,key);
    }

    @Override
    public String decrypt(String data,String mode, int key) {
        return perform(data,mode,key);
    }
}
