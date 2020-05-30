package Layered;

import Layered.Objects.CustomerEntity;

//@Repository
	 interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
	    
	    CustomerEntity findByUsername(String username);
	    
}