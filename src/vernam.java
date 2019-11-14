class vernam extends encryption{
    private int asciikey;
    private int currentCheck;

    protected void encryptCharacterNumber(int whichOne) {
        char p = plaintext.charAt(whichOne);
        int asciitext = (int) p;
        char l=key.toLowerCase().charAt(whichOne);
        asciikey=(int)l;
        int asciicyper = asciitext ^asciikey;
        /*String textcyper=Integer.toString(asciicyper);*/
        cyphertext+=(asciicyper+" ");
    }

    void decrypt(){
        int m=0;
        int n=0;
        for(int i=0;i<plaintext.length();i++){
            try {
                char a = plaintext.charAt(m);
                try {
                    char b = plaintext.charAt(m + 1);
                    if (a >= '0' && a <= '9' && b >= '0' && b <= '9') {
                        String c=""+Character.getNumericValue(a)+Character.getNumericValue(b);
                        currentCheck = Integer.parseInt(c);
                        decryptCharacterNumber(n);
                        m = m + 2;
                        n++;
                    }else if(a>='0'&&a<='9'){
                        currentCheck = Character.getNumericValue(a);
                        decryptCharacterNumber(n);
                        n++;
                    }
                } catch (Exception e) {
                    if (a >= '0' && a <= '9') {
                        currentCheck = Character.getNumericValue(a);
                        decryptCharacterNumber(n);
                        n++;
                    }
                }
                m++;

            }catch (Exception ignored){
            }
        }
    }
    void decryptCharacterNumber(int whichOne){
        char l = key.toLowerCase().charAt(whichOne);
        asciikey = (int) l;
        int asciicyper = currentCheck ^ asciikey;
        char finalLetter = (char) asciicyper;
        cyphertext += (finalLetter);
    }
}

