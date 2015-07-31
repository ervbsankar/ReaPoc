package controller;


import Entity.ReaOTL;
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

    /*Below method to get all otl associated with DPCI */

    @RequestMapping(value= "/{dept}/{class}/{item}", method= RequestMethod.GET)
    public ResponseEntity<OtlListResource> getAllOtl(@PathVariable("dept") Integer dept, @PathVariable("class") Integer
            clas,@PathVariable("item") Integer item) {

        ReaOtlList reaOtlList = new ReaOtlList();
        System.out.println("entered to controller");
        System.out.println(clas);
        reaOtlList.setReaOtlList(reaDao.findOtlItem(dept, clas, item));
        List<ReaOTL>  reaotl = reaOtlList.getReaOtlList();
        OtlListResource res = null;
        if(reaOtlList != null) {
            res = new OtlListResourceAsm().toResource(reaOtlList);
        }
        return new ResponseEntity<OtlListResource>(res, HttpStatus.OK);
    }


    @RequestMapping(value= "/{dept}/{class}", method= RequestMethod.GET)
    public ResponseEntity<OtlListResource> getAllOtl(@PathVariable("dept") Integer dept, @PathVariable("class") Integer
            clas) {

        ReaOtlList reaOtlList = new ReaOtlList();
        System.out.println("entered to controller");
        reaOtlList.setReaOtlList(reaDao.findOtlClas(dept, clas));
        List<ReaOTL>  reaotl = reaOtlList.getReaOtlList();
        OtlListResource res = null;
        if(reaOtlList != null) {
            res = new OtlListResourceAsm().toResource(reaOtlList);
        }
        return new ResponseEntity<OtlListResource>(res, HttpStatus.OK);
    }

    @RequestMapping(value= "/{dept}", method= RequestMethod.GET)
    public ResponseEntity<OtlListResource> getAllOtl(@PathVariable("dept") Integer dept) {

        ReaOtlList reaOtlList = new ReaOtlList();
        System.out.println("entered to controller");
        reaOtlList.setReaOtlList(reaDao.findOtlDept(dept));
        List<ReaOTL>  reaotl = reaOtlList.getReaOtlList();
        OtlListResource res = null;
        if(reaOtlList != null) {
            res = new OtlListResourceAsm().toResource(reaOtlList);
        }
        return new ResponseEntity<OtlListResource>(res, HttpStatus.OK);
    }
}
