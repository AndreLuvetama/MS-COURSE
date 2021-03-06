package com.microservices.hrpayroll.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microservices.hrpayroll.entities.Payment;
import com.microservices.hrpayroll.entities.Worker;
import com.microservices.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	//@Value("${hr-worker.host}")
	//private String workerHost; // colocamos a worker.host na variavel WorkerHost
	
	@Autowired
	private WorkerFeignClient workerFeignclient;
	
	public Payment getPayment(long workerId, int days) {
		// Mapa de parametro
		//Map<String, String> uriVariables = new HashMap<>();
		//uriVariables.put("id", ""+workerId);
		
		
		Worker worker = workerFeignclient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
		
	}

}
