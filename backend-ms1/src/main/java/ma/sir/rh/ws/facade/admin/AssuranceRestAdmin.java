package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.Assurance;
import ma.sir.rh.bean.history.AssuranceHistory;
import ma.sir.rh.dao.criteria.core.AssuranceCriteria;
import ma.sir.rh.dao.criteria.history.AssuranceHistoryCriteria;
import ma.sir.rh.service.facade.admin.AssuranceAdminService;
import ma.sir.rh.ws.converter.AssuranceConverter;
import ma.sir.rh.ws.dto.AssuranceDto;
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

@Api("Manages assurance services")
@RestController
@RequestMapping("/api/admin/assurance/")
public class AssuranceRestAdmin  extends AbstractController<Assurance, AssuranceDto, AssuranceHistory, AssuranceCriteria, AssuranceHistoryCriteria, AssuranceAdminService, AssuranceConverter> {


    @ApiOperation("upload one assurance")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple assurances")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all assurances")
    @GetMapping("")
    public ResponseEntity<List<AssuranceDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a assurance by id")
    @GetMapping("id/{id}")
    public ResponseEntity<AssuranceDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  assurance")
    @PostMapping("")
    public ResponseEntity<AssuranceDto> save(@RequestBody AssuranceDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  assurance")
    @PutMapping("")
    public ResponseEntity<AssuranceDto> update(@RequestBody AssuranceDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of assurance")
    @PostMapping("multiple")
    public ResponseEntity<List<AssuranceDto>> delete(@RequestBody List<AssuranceDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified assurance")
    @DeleteMapping("")
    public ResponseEntity<AssuranceDto> delete(@RequestBody AssuranceDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified assurance")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple assurances by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by societe id")
    @GetMapping("societe/id/{id}")
    public List<Assurance> findBySocieteId(@PathVariable Long id){
        return service.findBySocieteId(id);
    }
    @ApiOperation("delete by societe id")
    @DeleteMapping("societe/id/{id}")
    public int deleteBySocieteId(@PathVariable Long id){
        return service.deleteBySocieteId(id);
    }
    @ApiOperation("find by compagnieAssurance id")
    @GetMapping("compagnieAssurance/id/{id}")
    public List<Assurance> findByCompagnieAssuranceId(@PathVariable Long id){
        return service.findByCompagnieAssuranceId(id);
    }
    @ApiOperation("delete by compagnieAssurance id")
    @DeleteMapping("compagnieAssurance/id/{id}")
    public int deleteByCompagnieAssuranceId(@PathVariable Long id){
        return service.deleteByCompagnieAssuranceId(id);
    }
    @ApiOperation("find by employe id")
    @GetMapping("employe/id/{id}")
    public List<Assurance> findByEmployeId(@PathVariable Long id){
        return service.findByEmployeId(id);
    }
    @ApiOperation("delete by employe id")
    @DeleteMapping("employe/id/{id}")
    public int deleteByEmployeId(@PathVariable Long id){
        return service.deleteByEmployeId(id);
    }
    @ApiOperation("find by lienParente id")
    @GetMapping("lienParente/id/{id}")
    public List<Assurance> findByLienParenteId(@PathVariable Long id){
        return service.findByLienParenteId(id);
    }
    @ApiOperation("delete by lienParente id")
    @DeleteMapping("lienParente/id/{id}")
    public int deleteByLienParenteId(@PathVariable Long id){
        return service.deleteByLienParenteId(id);
    }
    @ApiOperation("Finds assurances by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<AssuranceDto>> findByCriteria(@RequestBody AssuranceCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated assurances by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody AssuranceCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports assurances by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody AssuranceCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets assurance data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody AssuranceCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets assurance history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets assurance paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody AssuranceHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports assurance history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody AssuranceHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets assurance history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody AssuranceHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public AssuranceRestAdmin (AssuranceAdminService service, AssuranceConverter converter) {
        super(service, converter);
    }


}