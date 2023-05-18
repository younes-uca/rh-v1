package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.DemandeConge;
import ma.sir.rh.bean.history.DemandeCongeHistory;
import ma.sir.rh.dao.criteria.core.DemandeCongeCriteria;
import ma.sir.rh.dao.criteria.history.DemandeCongeHistoryCriteria;
import ma.sir.rh.service.facade.admin.DemandeCongeAdminService;
import ma.sir.rh.ws.converter.DemandeCongeConverter;
import ma.sir.rh.ws.dto.DemandeCongeDto;
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

@Api("Manages demandeConge services")
@RestController
@RequestMapping("/api/admin/demandeConge/")
public class DemandeCongeRestAdmin  extends AbstractController<DemandeConge, DemandeCongeDto, DemandeCongeHistory, DemandeCongeCriteria, DemandeCongeHistoryCriteria, DemandeCongeAdminService, DemandeCongeConverter> {


    @ApiOperation("upload one demandeConge")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple demandeConges")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all demandeConges")
    @GetMapping("")
    public ResponseEntity<List<DemandeCongeDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a demandeConge by id")
    @GetMapping("id/{id}")
    public ResponseEntity<DemandeCongeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  demandeConge")
    @PostMapping("")
    public ResponseEntity<DemandeCongeDto> save(@RequestBody DemandeCongeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  demandeConge")
    @PutMapping("")
    public ResponseEntity<DemandeCongeDto> update(@RequestBody DemandeCongeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of demandeConge")
    @PostMapping("multiple")
    public ResponseEntity<List<DemandeCongeDto>> delete(@RequestBody List<DemandeCongeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified demandeConge")
    @DeleteMapping("")
    public ResponseEntity<DemandeCongeDto> delete(@RequestBody DemandeCongeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified demandeConge")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple demandeConges by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by employe id")
    @GetMapping("employe/id/{id}")
    public List<DemandeConge> findByEmployeId(@PathVariable Long id){
        return service.findByEmployeId(id);
    }
    @ApiOperation("delete by employe id")
    @DeleteMapping("employe/id/{id}")
    public int deleteByEmployeId(@PathVariable Long id){
        return service.deleteByEmployeId(id);
    }
    @ApiOperation("find by departement id")
    @GetMapping("departement/id/{id}")
    public List<DemandeConge> findByDepartementId(@PathVariable Long id){
        return service.findByDepartementId(id);
    }
    @ApiOperation("delete by departement id")
    @DeleteMapping("departement/id/{id}")
    public int deleteByDepartementId(@PathVariable Long id){
        return service.deleteByDepartementId(id);
    }
    @ApiOperation("find by etatDemandeConge id")
    @GetMapping("etatDemandeConge/id/{id}")
    public List<DemandeConge> findByEtatDemandeCongeId(@PathVariable Long id){
        return service.findByEtatDemandeCongeId(id);
    }
    @ApiOperation("delete by etatDemandeConge id")
    @DeleteMapping("etatDemandeConge/id/{id}")
    public int deleteByEtatDemandeCongeId(@PathVariable Long id){
        return service.deleteByEtatDemandeCongeId(id);
    }
    @ApiOperation("find by typeDemandeConge id")
    @GetMapping("typeDemandeConge/id/{id}")
    public List<DemandeConge> findByTypeDemandeCongeId(@PathVariable Long id){
        return service.findByTypeDemandeCongeId(id);
    }
    @ApiOperation("delete by typeDemandeConge id")
    @DeleteMapping("typeDemandeConge/id/{id}")
    public int deleteByTypeDemandeCongeId(@PathVariable Long id){
        return service.deleteByTypeDemandeCongeId(id);
    }
    @ApiOperation("Finds demandeConges by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<DemandeCongeDto>> findByCriteria(@RequestBody DemandeCongeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated demandeConges by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody DemandeCongeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports demandeConges by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody DemandeCongeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets demandeConge data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody DemandeCongeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets demandeConge history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets demandeConge paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody DemandeCongeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports demandeConge history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody DemandeCongeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets demandeConge history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody DemandeCongeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public DemandeCongeRestAdmin (DemandeCongeAdminService service, DemandeCongeConverter converter) {
        super(service, converter);
    }


}