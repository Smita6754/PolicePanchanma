package com.panchanama.controller;

import com.itextpdf.text.DocumentException;
import com.panchanama.service.PdfService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import java.io.IOException;

@RestController
@RequestMapping("/api/pdf")
public class PdfController {

    @Autowired
    private PdfService pdfService;

    @GetMapping("/download")
    public ResponseEntity<byte[]> downloadPdf() throws DocumentException, IOException {
        // Marathi content
        String content = "उत्तर प्रदेशात रेल्वेची सर्वाधिक स्थानके आहेत. येथे सुमारे ५५० रेल्वे स्थानके आहेत. यातील २३० स्थानके ही उत्तर मध्य रेल्वे झोनमध्ये आहेत. तर उर्वरित १७० रेल्वे स्थानके उत्तर -पूर्व रेल्वे झोनमध्ये आहेत. गोरखपूर रेल्वे स्थानक हे उत्तर प्रदेशातील सर्वात मोठे रेल्वे स्थानक आहे. याच यादीत मथुरा जंक्शन आणि कानपूर जंक्शन देखील सामील आहेत. जगातील सर्वात लांब प्लॅटफॉर्म पश्चिम बंगालच्या खड़गपुर येथे होता. त्याची लांबी १०७२.५ मीटर होती. त्यानंतर पुनर्विकासानंतर उत्तर प्रदेशातील गोरखपुर जंक्शनच्या प्लॅटफॉर्म नंबर-१ आणि २ ची संयुक्त लांबी १३६६.४ मीटर झाली, त्यानंतर तो लांब प्लॅटफॉर्म झाला. मात्र आता कर्नाटक राज्यातील हुबळी येथे श्री सिद्धरुद्ध स्वामीजी रेल्वे स्थानकावर जगातील सर्वात मोठे रेल्वे प्लॅटफॉर्म बांधला आहे. या रेल्वे प्लॅटफॉर्मची लांबीच जवळपास १५०७ मीटर आहे. या रेल्वे प्लॅटफॉर्मचे नाव गिनीज बुक ऑफ वर्ल्ड रेकॉर्डमध्येही नोंदले गेले आहे. हा प्लॅटफॉर्म बांधण्यासाठी एकूण २० कोटी रुपयांहून अधिक खर्च आला आहे.";

        byte[] pdfBytes = pdfService.generatePdf(content);

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_PDF)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=marathi_data.pdf")
                .body(pdfBytes);
    }
}

