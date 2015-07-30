package Hateoas.Assembler;

import Entity.ReaOtl;
import Hateoas.OtlResource;
import controller.OtlController;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

public class OtlResourceAsm extends ResourceAssemblerSupport<ReaOtl, OtlResource> {

    public OtlResourceAsm() {
        super(OtlController.class, OtlResource.class);
    }

    @Override
    public OtlResource toResource(ReaOtl en) {
        OtlResource res = new OtlResource();
        res.setDeptId(en.getPrimaryKey().getDeptId());
        res.setClassId(en.getPrimaryKey().getClassId());
        res.setItemId(en.getPrimaryKey().getItemId());
        res.setStoreId(en.getPrimaryKey().getStoreId());
        res.setBiQty(en.getBiQty());
        res.setPbiQty(en.getPbiQty());
        res.setDdQty(en.getDdQty());
        res.setOtlQty(en.getOtlQty());
        res.add(linkTo(OtlController.class)
                .slash(res.getDeptId())
                .slash(res.getClassId())
                .slash(res.getItemId())
                .slash(res.getStoreId())
                .withSelfRel());
        return res;
    }
}
