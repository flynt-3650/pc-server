package ru.flynt3650.pc_server;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.flynt3650.pc_server.dto.CartDto;
import ru.flynt3650.pc_server.models.cart.Cart;

@SpringBootApplication
public class PcServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PcServerApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper mapper = new ModelMapper();

//        // Configure Cart to CartDto mapping
//        mapper.typeMap(Cart.class, CartDto.class)
//                .addMapping(src -> src.getId().getPcId(),
//                        (dest, value) -> dest.getId().setPcId((Integer) value))
//                .addMapping(src -> src.getId().getAppUserId(),
//                        (dest, value) -> dest.getId().setAppUserId((Integer) value));

        return mapper;
    }

}
