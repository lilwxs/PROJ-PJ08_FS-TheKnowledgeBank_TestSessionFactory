//package com.all.knowledge.Repository;
//
//import org.springframework.data.repository.NoRepositoryBean;
//
//import java.util.List;
//import java.util.Optional;
//
//@NoRepositoryBean
//public abstract class BaseRepoAdapter<T, ID> implements BaseRepo<T, ID> {
//
//    private BaseRepo<T, ID> baseRepo;
//
//    public BaseRepoAdapter(BaseRepo<T, ID> baseRepo) {
//        this.baseRepo = baseRepo;
//    }
//
//    @Override
//    public List<T> findAll() {
//        // You can add some custom logic here before or after calling the baseRepo method
//        return baseRepo.findAll();
//    }
//
//    @Override
//    public Optional<T> findById(ID id) {
//        // You can add some custom logic here before or after calling the baseRepo method
//        return baseRepo.findById(id);
//    }
//
//    @Override
//    public T save(T object) {
//        // You can add some custom logic here before or after calling the baseRepo method
//        return baseRepo.save(object);
//    }
//
//    @Override
//    public void deleteById(ID id) {
//        // You can add some custom logic here before or after calling the baseRepo method
//        baseRepo.deleteById(id);
//    }
//}
