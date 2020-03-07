public boolean parrotTrouble(boolean talking, int hour) {
  return(hour<7 && talking || hour>20 &&talking);
}
