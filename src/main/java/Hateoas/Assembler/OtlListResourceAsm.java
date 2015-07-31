package Hateoas.Assembler;

import Entity.ReaOtlList;
import Hateoas.OtlListResource;
import controller.OtlController;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

/**
 * Created by A513915 on 7/30/2015.
 */
public class OtlListResourceAsm extends ResourceAssemblerSupport<ReaOtlList, OtlListResource> {


    public OtlListResourceAsm() {
        super(OtlController.class, OtlListResource.class);
    }

    @Override
    public OtlListResource toResource(ReaOtlList entity) {
        OtlListResource res = new OtlListResource();
        res.setOtlList(new OtlResourceAsm().toResources(entity.getReaOtlList()));
        return res;
    }
}
