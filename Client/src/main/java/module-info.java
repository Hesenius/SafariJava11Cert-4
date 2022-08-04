module Client {
  requires java.base; // IMPLIED :)
  // "reading" a module implies being permitted
  // to use its stuff
  // "requires" a) reads the module and
  // b) adds that module (transitively) to the dependency graph
  requires Provider;

//  uses InterfaceDescription;
}
