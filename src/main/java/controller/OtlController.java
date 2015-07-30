package controller;


import Entity.ReaOtl;
import Entity.ReaOtlList;
import Hateoas.Assembler.OtlListResourceAsm;
import Hateoas.OtlListResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import repo.ReaDao;

import java.util.List;

@Controller
@RequestMapping(value = "/resources/otl")
public class OtlController {

    @Autowired
    private ReaDao reaDao;

    @RequestMapping(value= "/{dept}/{class}/{item}", method= RequestMethod.GET)
    public ResponseEntity<OtlListResource> getAllOtl(@PathVariable("dept") Integer dept, @PathVariable("class") Integer
            clas,@PathVariable("item") Integer item) {

        ReaOtlList reaOtlList = new ReaOtlList();
        System.out.println("entered to controller");
        reaOtlList.setReaOtlList(reaDao.findOtl());
        List<ReaOtl>  reaotl = reaOtlList.getReaOtlList();
        for( ReaOtl otl : reaotl){
            System.out.println("I am Object " + otl);
            System.out.println("Dept: " + otl.getPrimaryKey().getDeptId());
        }
        OtlListResource res = null;
        if(reaOtlList != null) {
            res = new OtlListResourceAsm().toResource(reaOtlList);
        }
        return new ResponseEntity<OtlListResource>(res, HttpStatus.OK);
    }
}
