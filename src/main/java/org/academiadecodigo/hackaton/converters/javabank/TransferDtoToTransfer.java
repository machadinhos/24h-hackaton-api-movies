package org.academiadecodigo.hackaton.converters.javabank;

import org.academiadecodigo.hackaton.command.javabank.TransferDto;
import org.academiadecodigo.hackaton.domain.javabank.Transfer;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * A {@link Converter} implementation, responsible for {@link TransferDto} to {@link Transfer} type conversion
 */
@Component
public class TransferDtoToTransfer implements Converter<TransferDto, Transfer> {

    /**
     * Converts the transfer DTO object into a transfer domain object
     *
     * @param transferDto the transfer DTO
     * @return the transfer object
     */
    @Override
    public Transfer convert (TransferDto transferDto) {

        Transfer transfer = new Transfer();

        transfer.setSrcId(transferDto.getSrcId());
        transfer.setDstId(transferDto.getDstId());
        transfer.setAmount(Double.parseDouble(transferDto.getAmount()));

        return transfer;
    }

}
