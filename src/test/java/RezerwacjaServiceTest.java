import Code.challenge.spring.boot.application.controllers.RezerwacjiController;
import Code.challenge.spring.boot.application.models.Rezerwacja;
import Code.challenge.spring.boot.application.services.RezerwacjaService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebAppConfiguration
public class RezerwacjaServiceTest {
    private MockMvc mockMvc;

    @Mock
    private RezerwacjaService rezerwacjaService;

    @InjectMocks
    private RezerwacjiController rezerwacjiController;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(rezerwacjiController).build();
    }

    @Test
    public void showAll() throws Exception {
        List<Rezerwacja> list = new ArrayList<>();
        list.add(new Rezerwacja());
        list.add(new Rezerwacja());
        list.add(new Rezerwacja());

        when(rezerwacjiController.showAll()).thenReturn(list);

        mockMvc.perform(
                get("/rezerwacji")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(list)))
                .andExpect(status().isOk());

        verify(rezerwacjaService, times(1)).showAll();
        verifyNoMoreInteractions(rezerwacjaService);
    }
}
