{
   ...
   current.begin();           // create new action
   ...
   trans_object2.operation(arg);    // implicit propagation
   ...
   current.commit(false);        // simple commit
   ...
}