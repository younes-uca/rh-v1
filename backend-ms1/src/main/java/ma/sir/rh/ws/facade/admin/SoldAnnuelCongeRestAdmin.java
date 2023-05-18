package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.SoldAnnuelConge;
import ma.sir.rh.bean.history.SoldAnnuelCongeHistory;
import ma.sir.rh.dao.criteria.core.SoldAnnuelCongeCriteria;
import ma.sir.rh.dao.criteria.history.SoldAnnuelCongeHistoryCriteria;
import ma.sir.rh.service.facade.admin.SoldAnnuelCongeAdminService;
import ma.sir.rh.ws.converter.SoldAnnuelCongeConverter;
import ma.sir.rh.ws.dto.SoldAnnuelCongeDto;
import ma.sir.rh.zynerator.controller.AbstractController;
import ma.sir.rh.zynerator.dto.AuditEntityDto;
import ma.sir.rh.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.sir.rh.zynerator.process.Result;

import org.springframework.web.multipart.MultipartFile;
import ma.sir.rh.zynerator.dto.FileTempDto;

@Api("Manages soldAnnuelConge services")
@RestController
@RequestMapping("/api/admin/soldAnnuelConge/")
public class SoldAnnuelCongeRestAdmin  extends AbstractController<SoldAnnuelConge, SoldAnnuelCongeDto, SoldAnnuelCongeHistory, SoldAnnuelCongeCriteria, SoldAnnuelCongeHistoryCriteria, SoldAnnuelCongeAdminService, SoldAnnuelCongeConverter> {


    @ApiOperation("upload one soldAnnuelConge")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple soldAnnuelConges")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all soldAnnuelConges")
    @GetMapping("")
    public ResponseEntity<List<SoldAnnuelCongeDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a soldAnnuelConge by id")
    @GetMapping("id/{id}")
    public ResponseEntity<SoldAnnuelCongeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  soldAnnuelConge")
    @PostMapping("")
    public ResponseEntity<SoldAnnuelCongeDto> save(@RequestBody SoldAnnuelCongeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  soldAnnuelConge")
    @PutMapping("")
    public ResponseEntity<SoldAnnuelCongeDto> update(@RequestBody SoldAnnuelCongeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of soldAnnuelConge")
    @PostMapping("multiple")
    public ResponseEntity<List<SoldAnnuelCongeDto>> delete(@RequestBody List<SoldAnnuelCongeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified soldAnnuelConge")
    @DeleteMapping("")
    public ResponseEntity<SoldAnnuelCongeDto> delete(@RequestBody SoldAnnuelCongeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified soldAnnuelConge")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple soldAnnuelConges by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by employe id")
    @GetMapping("employe/id/{id}")
    public List<SoldAnnuelConge> findByEmployeId(@PathVariable Long id){
        return service.findByEmployeId(id);
    }
    @ApiOperation("delete by employe id")
    @DeleteMapping("employe/id/{id}")
    public int deleteByEmployeId(@PathVariable Long id){
        return service.deleteByEmployeId(id);
    }
    @ApiOperation("Finds soldAnnuelConges by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<SoldAnnuelCongeDto>> findByCriteria(@RequestBody SoldAnnuelCongeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated soldAnnuelConges by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody SoldAnnuelCongeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports soldAnnuelConges by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody SoldAnnuelCongeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets soldAnnuelConge data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody SoldAnnuelCongeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets soldAnnuelConge history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets soldAnnuelConge paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody SoldAnnuelCongeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports soldAnnuelConge history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody SoldAnnuelCongeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets soldAnnuelConge history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody SoldAnnuelCongeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public SoldAnnuelCongeRestAdmin (SoldAnnuelCongeAdminService service, SoldAnnuelCongeConverter converter) {
        super(service, converter);
    }


}