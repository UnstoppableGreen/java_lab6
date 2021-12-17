package ru.rsatu.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import ru.rsatu.pojo.Orders;
import ru.rsatu.pojo.Specification;
import ru.rsatu.pojo.Status;

@ApplicationScoped
public class OrdersService {
    @Inject
    EntityManager em;
    
    @Transactional
    public void createOrder(Long clientID, Long statusID) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
        Orders order = new Orders();
        order.setClientID(clientID);
        order.setStatusID(statusID);
        order.setCreationDate(dateFormat.format(date));
        order.setLastUpdateOn(dateFormat.format(date));
        order.addSpecification(null);
        em.merge(order);
    }

    

  /*  //вставка данных
    @Transactional
    public Status insertStatus(Status status) {
        em.persist(status);
        em.flush();
        return status;
    }

    //обновление данных
    @Transactional
    public Status updateStatus(Status status) {
        em.merge(status);
        em.flush();
        return status;
    }

    //удаление данных
    @Transactional
    public void deleteStatus(Status status) {
        Status s = getStatusById(status.getId());
        em.remove(s);
        em.flush();
    }

    public List<Status> getStatuses() {
        return em.createQuery(" select s from Status s ", Status.class).getResultList();
    }

    public Status getStatusById(Long id) {
        Status status = em.find(Status.class, id);
        return status;
    }
*/
}
