class encryption{
    String plaintext;
    public String cyphertext;
    String key;
    public void setPlainText(String v){
        plaintext=v;
    }

    public void encrypt(){
        for(int i=0; i<plaintext.length();i++){
            encryptCharacterNumber(i);
        }
    }
    public void setKey(String c){
        key=c;
    }

    void encryptCharacterNumber(int whichOne) {
        Character p = plaintext.toLowerCase().charAt(whichOne);
        int keyy=Integer.parseInt(key);
        int m=(int)p;
        if(m>96&&m<123){
            int finalLetter=m+keyy;
            while(finalLetter>122){
                finalLetter-=26;
            }
            cyphertext+=(char)finalLetter;
        }else if(m>47&&m<58){
            int finalLetter=m+keyy;
            while(finalLetter>57) finalLetter-=9;
            cyphertext+=(char)finalLetter;
        }else if(m==32){
            cyphertext+=(char)32;
        }
    }
    void decrypt(){
        for(int i=0; i<plaintext.length();i++){
            decryptCharacterNumber(i);
        }
    }
    void decryptCharacterNumber(int whichOne) {
        Character p = plaintext.toLowerCase().charAt(whichOne);
        int keyy=Integer.parseInt(key);
        int m=(int)p;
        if(m>96&&m<123){
            int finalLetter=m-keyy;
            while(finalLetter<97){
                finalLetter+=26;
            }
            cyphertext+=(char)finalLetter;
        }else if(m>47&&m<58){
            int finalLetter=m-keyy;
            while(finalLetter<57) finalLetter+=9;
            cyphertext+=(char)finalLetter;
        }else if(m==32){
            cyphertext+=(char)32;
        }
    }

}
