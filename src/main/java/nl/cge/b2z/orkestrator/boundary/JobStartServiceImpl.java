package nl.cge.b2z.orkestrator.boundary;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(serviceName = "JobStartService")
public class JobStartServiceImpl implements JobStartService {

    @WebMethod
    @Override
    public String startJob(Integer jobId) {
        return "job met id " + jobId + " gestart";
    }

}
