package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.EtatDemandeConge;
import ma.sir.rh.bean.history.EtatDemandeCongeHistory;
import ma.sir.rh.dao.criteria.core.EtatDemandeCongeCriteria;
import ma.sir.rh.dao.criteria.history.EtatDemandeCongeHistoryCriteria;
import ma.sir.rh.service.facade.admin.EtatDemandeCongeAdminService;
import ma.sir.rh.ws.converter.EtatDemandeCongeConverter;
import ma.sir.rh.ws.dto.EtatDemandeCongeDto;
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

@Api("Manages etatDemandeConge services")
@RestController
@RequestMapping("/api/admin/etatDemandeConge/")
public class EtatDemandeCongeRestAdmin  extends AbstractController<EtatDemandeConge, EtatDemandeCongeDto, EtatDemandeCongeHistory, EtatDemandeCongeCriteria, EtatDemandeCongeHistoryCriteria, EtatDemandeCongeAdminService, EtatDemandeCongeConverter> {


    @ApiOperation("upload one etatDemandeConge")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple etatDemandeConges")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all etatDemandeConges")
    @GetMapping("")
    public ResponseEntity<List<EtatDemandeCongeDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all etatDemandeConges")
    @GetMapping("optimized")
    public ResponseEntity<List<EtatDemandeCongeDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a etatDemandeConge by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EtatDemandeCongeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  etatDemandeConge")
    @PostMapping("")
    public ResponseEntity<EtatDemandeCongeDto> save(@RequestBody EtatDemandeCongeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  etatDemandeConge")
    @PutMapping("")
    public ResponseEntity<EtatDemandeCongeDto> update(@RequestBody EtatDemandeCongeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of etatDemandeConge")
    @PostMapping("multiple")
    public ResponseEntity<List<EtatDemandeCongeDto>> delete(@RequestBody List<EtatDemandeCongeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified etatDemandeConge")
    @DeleteMapping("")
    public ResponseEntity<EtatDemandeCongeDto> delete(@RequestBody EtatDemandeCongeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified etatDemandeConge")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple etatDemandeConges by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds etatDemandeConges by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EtatDemandeCongeDto>> findByCriteria(@RequestBody EtatDemandeCongeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated etatDemandeConges by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EtatDemandeCongeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatDemandeConges by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EtatDemandeCongeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets etatDemandeConge data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EtatDemandeCongeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets etatDemandeConge history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets etatDemandeConge paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EtatDemandeCongeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatDemandeConge history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EtatDemandeCongeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets etatDemandeConge history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EtatDemandeCongeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EtatDemandeCongeRestAdmin (EtatDemandeCongeAdminService service, EtatDemandeCongeConverter converter) {
        super(service, converter);
    }


}