package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.Departement;
import ma.sir.rh.bean.history.DepartementHistory;
import ma.sir.rh.dao.criteria.core.DepartementCriteria;
import ma.sir.rh.dao.criteria.history.DepartementHistoryCriteria;
import ma.sir.rh.service.facade.admin.DepartementAdminService;
import ma.sir.rh.ws.converter.DepartementConverter;
import ma.sir.rh.ws.dto.DepartementDto;
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

@Api("Manages departement services")
@RestController
@RequestMapping("/api/admin/departement/")
public class DepartementRestAdmin  extends AbstractController<Departement, DepartementDto, DepartementHistory, DepartementCriteria, DepartementHistoryCriteria, DepartementAdminService, DepartementConverter> {


    @ApiOperation("upload one departement")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple departements")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all departements")
    @GetMapping("")
    public ResponseEntity<List<DepartementDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a departement by id")
    @GetMapping("id/{id}")
    public ResponseEntity<DepartementDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  departement")
    @PostMapping("")
    public ResponseEntity<DepartementDto> save(@RequestBody DepartementDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  departement")
    @PutMapping("")
    public ResponseEntity<DepartementDto> update(@RequestBody DepartementDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of departement")
    @PostMapping("multiple")
    public ResponseEntity<List<DepartementDto>> delete(@RequestBody List<DepartementDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified departement")
    @DeleteMapping("")
    public ResponseEntity<DepartementDto> delete(@RequestBody DepartementDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified departement")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple departements by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by siege id")
    @GetMapping("siege/id/{id}")
    public List<Departement> findBySiegeId(@PathVariable Long id){
        return service.findBySiegeId(id);
    }
    @ApiOperation("delete by siege id")
    @DeleteMapping("siege/id/{id}")
    public int deleteBySiegeId(@PathVariable Long id){
        return service.deleteBySiegeId(id);
    }
    @ApiOperation("find by employe id")
    @GetMapping("employe/id/{id}")
    public List<Departement> findByEmployeId(@PathVariable Long id){
        return service.findByEmployeId(id);
    }
    @ApiOperation("delete by employe id")
    @DeleteMapping("employe/id/{id}")
    public int deleteByEmployeId(@PathVariable Long id){
        return service.deleteByEmployeId(id);
    }
    @ApiOperation("find by station id")
    @GetMapping("station/id/{id}")
    public List<Departement> findByStationId(@PathVariable Long id){
        return service.findByStationId(id);
    }
    @ApiOperation("delete by station id")
    @DeleteMapping("station/id/{id}")
    public int deleteByStationId(@PathVariable Long id){
        return service.deleteByStationId(id);
    }
    @ApiOperation("Finds departements by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<DepartementDto>> findByCriteria(@RequestBody DepartementCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated departements by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody DepartementCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports departements by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody DepartementCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets departement data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody DepartementCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets departement history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets departement paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody DepartementHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports departement history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody DepartementHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets departement history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody DepartementHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public DepartementRestAdmin (DepartementAdminService service, DepartementConverter converter) {
        super(service, converter);
    }


}