/*
 * MIT License
 *
 * Copyright (c) 2016 EPAM Systems
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.epam.catgenome.controller.vo.externaldb.ensemblevo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Source:
 * Created:     5/26/2016
 * Project:     CATGenome Browser
 * Make:        IntelliJ IDEA 14.1.1, JDK 1.8
 *
 * <p>
 * class for extarnale DB data (exon)
 * </p>
 *
 */
public class EnsemblExonVO extends EnsemblDBBaseVO {

    @JsonProperty(value = "version")
    private Integer version;

    @JsonProperty(value = "assembly_name")
    private String assemblyName;

    @JsonProperty(value = "seq_region_name")
    private String seqRegionName;

    @JsonProperty(value = "strand")
    private String strand;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getAssemblyName() {
        return assemblyName;
    }

    public void setAssemblyName(String assemblyName) {
        this.assemblyName = assemblyName;
    }

    public String getSeqRegionName() {
        return seqRegionName;
    }

    public void setSeqRegionName(String seqRegionName) {
        this.seqRegionName = seqRegionName;
    }

    public String getStrand() {
        return strand;
    }

    public void setStrand(String strand) {
        this.strand = strand;
    }
}
