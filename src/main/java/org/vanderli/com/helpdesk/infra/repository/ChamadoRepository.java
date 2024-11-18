package org.vanderli.com.helpdesk.infra.repository;

import jakarta.enterprise.context.ApplicationScoped;
import org.vanderli.com.helpdesk.infra.data.ChamadoData;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class ChamadoRepository implements PanacheRepository<ChamadoData> {
}
