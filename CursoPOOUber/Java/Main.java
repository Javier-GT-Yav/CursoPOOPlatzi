class Main {
  public static void main(String[] args) {
  
    UberX uberX = new UberX("ASD213", new Driver("Yav Gz", "INE", "yaav.gz@gmail.com", "newPassword1", "Mermision type C"), "Chevrolet", "Sonic");

    uberX.setPassenger(4);
    uberX.printDataCar();


    UberVan uberVan = new UberVan("DFG124", new Driver("Andres Herrera", "INE", "ejemplo@email.com", "AnotherPassword", "Carnet Type C"));

    uberVan.setPassenger(6);
    uberVan.printDataCar();


  }
}

// la clase debe tener el mismo nombre del archivo, public static sera la funcion que debemos pasar a la clase, y dentro podemos colocar el comportamiento 