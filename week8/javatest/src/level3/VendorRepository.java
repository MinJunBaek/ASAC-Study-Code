package level3;

import java.util.List;
import java.util.Optional;
import level3.dto.Vendor;

public class VendorRepository extends AbstractRepository<Vendor, Integer>{

    public Vendor create(Vendor entity) {
        Integer vendorKey = idGenerator();
        Vendor newVendor = new Vendor(vendorKey, entity.getName(), entity.getAge(), entity.getEmail(), entity.getAddress(), entity.getCategory());
        repository.put(vendorKey, newVendor);
        current();
        return repository.get(vendorKey);
    }

    public Vendor read(Integer id) {
        current();
        return Optional.ofNullable(repository.get(id))
            .filter((o1) -> !o1.getIsDeleted())
            .orElseThrow(() -> {
                throw new RuntimeException("해당 " + id + "가 없습니다.");
            });
    }

    public List<Vendor> read() {
        return repository.values()
            .stream()
            .filter((element) -> !element.getIsDeleted())
            .toList();
    }

    public Vendor update(Integer id, Vendor entity) {
        read(id);
        Vendor newVendor = new Vendor(id, entity.getName(), entity.getAge(), entity.getEmail(), entity.getAddress(), entity.getCategory());
        repository.put(id, newVendor);
        current();
        return repository.get(id);
    }

    public void delete(Integer id) {
        Vendor vendor = read(id);
        Vendor deleteVendor = new Vendor(vendor.getId(), vendor.getName(), true, vendor.getAge(), vendor.getEmail(), vendor.getAddress(), vendor.getCategory());
        repository.put(id, deleteVendor);
        current();
    }
}
