/*
 * Copyright (c) 2019. r4v3zn.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.suyu.core.DO;

import java.util.List;

/**
 * Title: FofaData
 * Descrption: this is fofa datas
 * Date:2019-06-08 17:49
 * Email:woo0nise@gmail.com
 * Company:www.j2ee.app
 *
 * @author R4v3zn
 * @version 1.0.0
 */
public class FofaData {

    /**
     * mode
     */
    private String mode;

    /**
     * current page no
     */
    private Integer page;

    /**
     * total size
     */
    private Integer size;

    /**
     * total page
     */
    private Integer totalPage;

    /**
     * query
     */
    private String query;

    /**
     * results
     */
    private List<List<String>> results;

    public void setQuery(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public String getMode() {
        return mode;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getSize() {
        return size;
    }

    public List<List<String>> getResults() {
        return results;
    }

    public void setResults(List<List<String>> results) {
        this.results = results;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "FofaData{" +
                "mode='" + mode + '\'' +
                ", page=" + page +
                ", size=" + size +
                ", totalPage=" + totalPage +
                ", query='" + query + '\'' +
                ", results=" + results +
                '}';
    }
}
