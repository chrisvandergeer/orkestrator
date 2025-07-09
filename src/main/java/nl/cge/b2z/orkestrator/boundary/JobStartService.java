package nl.cge.b2z.orkestrator.boundary;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(name = "JobStartService", serviceName = "JobStartService")
public interface JobStartService {

    @WebMethod
    String startJob(Integer jobId);
}
