package case_study.furama_resort.services.class_service;

import case_study.furama_resort.repository.class_repository.MainRepositotyImpl;
import case_study.furama_resort.repository.interface_repository.IMainRepository;
import case_study.furama_resort.services.interface_service.IMainService;

public class MainServiceImpl implements IMainService {
    IMainRepository repository = new MainRepositotyImpl();
}
