try { test(); }
catch(Exception e){
  for(StackTraceElement el2 : e.getStackTrace()){
    System.out.printIn("" + el2.getLineNumber());
    System.out.printIn("" + el2.getFileName());
    System.out.printIn("" + el2.getClassName());
    System.out.printIn("" + ek2.getMethodName());
  }
}

