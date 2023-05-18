package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.Reclamation;
import ma.sir.rh.bean.history.ReclamationHistory;
import ma.sir.rh.dao.criteria.core.ReclamationCriteria;
import ma.sir.rh.dao.criteria.history.ReclamationHistoryCriteria;
import ma.sir.rh.service.facade.admin.ReclamationAdminService;
import ma.sir.rh.ws.converter.ReclamationConverter;
import ma.sir.rh.ws.dto.ReclamationDto;
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

@Api("Manages reclamation services")
@RestController
@RequestMapping("/api/admin/reclamation/")
public class ReclamationRestAdmin  extends AbstractController<Reclamation, ReclamationDto, ReclamationHistory, ReclamationCriteria, ReclamationHistoryCriteria, ReclamationAdminService, ReclamationConverter> {


    @ApiOperation("upload one reclamation")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple reclamations")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all reclamations")
    @GetMapping("")
    public ResponseEntity<List<ReclamationDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all reclamations")
    @GetMapping("optimized")
    public ResponseEntity<List<ReclamationDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a reclamation by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ReclamationDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  reclamation")
    @PostMapping("")
    public ResponseEntity<ReclamationDto> save(@RequestBody ReclamationDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  reclamation")
    @PutMapping("")
    public ResponseEntity<ReclamationDto> update(@RequestBody ReclamationDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of reclamation")
    @PostMapping("multiple")
    public ResponseEntity<List<ReclamationDto>> delete(@RequestBody List<ReclamationDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified reclamation")
    @DeleteMapping("")
    public ResponseEntity<ReclamationDto> delete(@RequestBody ReclamationDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified reclamation")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple reclamations by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by typeReclamation id")
    @GetMapping("typeReclamation/id/{id}")
    public List<Reclamation> findByTypeReclamationId(@PathVariable Long id){
        return service.findByTypeReclamationId(id);
    }
    @ApiOperation("delete by typeReclamation id")
    @DeleteMapping("typeReclamation/id/{id}")
    public int deleteByTypeReclamationId(@PathVariable Long id){
        return service.deleteByTypeReclamationId(id);
    }
    @ApiOperation("find by etatReclamation id")
    @GetMapping("etatReclamation/id/{id}")
    public List<Reclamation> findByEtatReclamationId(@PathVariable Long id){
        return service.findByEtatReclamationId(id);
    }
    @ApiOperation("delete by etatReclamation id")
    @DeleteMapping("etatReclamation/id/{id}")
    public int deleteByEtatReclamationId(@PathVariable Long id){
        return service.deleteByEtatReclamationId(id);
    }
    @ApiOperation("find by employe id")
    @GetMapping("employe/id/{id}")
    public List<Reclamation> findByEmployeId(@PathVariable Long id){
        return service.findByEmployeId(id);
    }
    @ApiOperation("delete by employe id")
    @DeleteMapping("employe/id/{id}")
    public int deleteByEmployeId(@PathVariable Long id){
        return service.deleteByEmployeId(id);
    }
    @ApiOperation("Finds reclamations by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ReclamationDto>> findByCriteria(@RequestBody ReclamationCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated reclamations by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ReclamationCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports reclamations by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ReclamationCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets reclamation data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ReclamationCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets reclamation history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets reclamation paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ReclamationHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports reclamation history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ReclamationHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets reclamation history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ReclamationHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ReclamationRestAdmin (ReclamationAdminService service, ReclamationConverter converter) {
        super(service, converter);
    }


}