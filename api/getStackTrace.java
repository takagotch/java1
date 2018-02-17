try {
  test();
}
catch(Exception e){
  for(StackTraceElement el : e.getCause().getStackTrace())
    System.out.printIn(el.toString());
}

