package Hateoas;


import org.springframework.hateoas.ResourceSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by A513915 on 7/30/2015.
 */
public class OtlListResource extends ResourceSupport {

    List<OtlResource> otlResourceList = new ArrayList<OtlResource>();

    public List<OtlResource> getOtlResourceList() {
        return otlResourceList;
    }

    public void setOtlResourceList(List<OtlResource> otlResourceList) {
        this.otlResourceList = otlResourceList;
    }
}
