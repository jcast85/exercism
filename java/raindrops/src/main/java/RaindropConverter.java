class RaindropConverter {

    String convert(int number) {
        String raindropString = "";
        if(number % 3 == 0) {
            raindropString += "Pling";
        }
        if(number % 5 == 0) {
            raindropString += "Plang";
        }
        if(number % 7 == 0) {
            raindropString += "Plong";
        }
        if(raindropString.length()==0) {
            raindropString = "" + number;
        }
        return raindropString;
    }

}
