package br.uam.lab.soft.adapter.persistence.event;

import br.uam.lab.soft.adapter.persistence.OrderEntity;
import br.uam.lab.soft.adapter.persistence.SequenceGeneratorService;
import br.uam.lab.soft.common.PersistenceAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;

@PersistenceAdapter
@RequiredArgsConstructor
public class OrderListener extends AbstractMongoEventListener<OrderEntity> {

    private final SequenceGeneratorService sequenceGeneratorService;

    @Override
    public void onBeforeConvert(BeforeConvertEvent<OrderEntity> event) {
        if (event.getSource().getOrderId() < 1) {
            event.getSource().setOrderId(
                    sequenceGeneratorService
                            .generateSequence(OrderEntity.SEQUENCE_NAME)
            );
        }
    }
}
