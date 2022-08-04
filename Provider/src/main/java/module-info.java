// SIMON DID IT AGAIN!!!
// convention for module names is like package names
// dotted...
// my.provider.mod
// matching directories that have dots in them!!!! (not hierarchies)
/*open*/ module Provider {
  exports utils to Client, NonExistent;
  opens utils to Client;

  // InterfaceDescription must be visible to all participants
  // often an inteface, but not restricted to that
  // My implementation should NOT be in a public / exported package :)
  //provides InterfaceDescription with MyImplementation;
}
