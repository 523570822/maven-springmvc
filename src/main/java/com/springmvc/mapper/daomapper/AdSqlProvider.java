package com.springmvc.mapper.daomapper;

import com.springmvc.entity.Ad;
import com.springmvc.entity.AdExample.Criteria;
import com.springmvc.entity.AdExample.Criterion;
import com.springmvc.entity.AdExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class AdSqlProvider {

    public String countByExample(AdExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("ad");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(AdExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("ad");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Ad record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("ad");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifyDate() != null) {
            sql.VALUES("modify_date", "#{modifyDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getVersion() != null) {
            sql.VALUES("version", "#{version,jdbcType=BIGINT}");
        }
        
        if (record.getOrders() != null) {
            sql.VALUES("orders", "#{orders,jdbcType=INTEGER}");
        }
        
        if (record.getBeginDate() != null) {
            sql.VALUES("begin_date", "#{beginDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndDate() != null) {
            sql.VALUES("end_date", "#{endDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPath() != null) {
            sql.VALUES("path", "#{path,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getUrl() != null) {
            sql.VALUES("url", "#{url,jdbcType=VARCHAR}");
        }
        
        if (record.getAdPositionId() != null) {
            sql.VALUES("ad_position_id", "#{adPositionId,jdbcType=BIGINT}");
        }
        
        if (record.getTargetId() != null) {
            sql.VALUES("target_id", "#{targetId,jdbcType=BIGINT}");
        }
        
        if (record.getParam() != null) {
            sql.VALUES("param", "#{param,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            sql.VALUES("content", "#{content,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(AdExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("create_date");
        sql.SELECT("modify_date");
        sql.SELECT("version");
        sql.SELECT("orders");
        sql.SELECT("begin_date");
        sql.SELECT("end_date");
        sql.SELECT("path");
        sql.SELECT("title");
        sql.SELECT("type");
        sql.SELECT("url");
        sql.SELECT("ad_position_id");
        sql.SELECT("target_id");
        sql.SELECT("param");
        sql.SELECT("content");
        sql.FROM("ad");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(AdExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("create_date");
        sql.SELECT("modify_date");
        sql.SELECT("version");
        sql.SELECT("orders");
        sql.SELECT("begin_date");
        sql.SELECT("end_date");
        sql.SELECT("path");
        sql.SELECT("title");
        sql.SELECT("type");
        sql.SELECT("url");
        sql.SELECT("ad_position_id");
        sql.SELECT("target_id");
        sql.SELECT("param");
        sql.FROM("ad");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Ad record = (Ad) parameter.get("record");
        AdExample example = (AdExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("ad");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{record.createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifyDate() != null) {
            sql.SET("modify_date = #{record.modifyDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getVersion() != null) {
            sql.SET("version = #{record.version,jdbcType=BIGINT}");
        }
        
        if (record.getOrders() != null) {
            sql.SET("orders = #{record.orders,jdbcType=INTEGER}");
        }
        
        if (record.getBeginDate() != null) {
            sql.SET("begin_date = #{record.beginDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndDate() != null) {
            sql.SET("end_date = #{record.endDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPath() != null) {
            sql.SET("path = #{record.path,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{record.type,jdbcType=INTEGER}");
        }
        
        if (record.getUrl() != null) {
            sql.SET("url = #{record.url,jdbcType=VARCHAR}");
        }
        
        if (record.getAdPositionId() != null) {
            sql.SET("ad_position_id = #{record.adPositionId,jdbcType=BIGINT}");
        }
        
        if (record.getTargetId() != null) {
            sql.SET("target_id = #{record.targetId,jdbcType=BIGINT}");
        }
        
        if (record.getParam() != null) {
            sql.SET("param = #{record.param,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            sql.SET("content = #{record.content,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("ad");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("create_date = #{record.createDate,jdbcType=TIMESTAMP}");
        sql.SET("modify_date = #{record.modifyDate,jdbcType=TIMESTAMP}");
        sql.SET("version = #{record.version,jdbcType=BIGINT}");
        sql.SET("orders = #{record.orders,jdbcType=INTEGER}");
        sql.SET("begin_date = #{record.beginDate,jdbcType=TIMESTAMP}");
        sql.SET("end_date = #{record.endDate,jdbcType=TIMESTAMP}");
        sql.SET("path = #{record.path,jdbcType=VARCHAR}");
        sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        sql.SET("type = #{record.type,jdbcType=INTEGER}");
        sql.SET("url = #{record.url,jdbcType=VARCHAR}");
        sql.SET("ad_position_id = #{record.adPositionId,jdbcType=BIGINT}");
        sql.SET("target_id = #{record.targetId,jdbcType=BIGINT}");
        sql.SET("param = #{record.param,jdbcType=VARCHAR}");
        sql.SET("content = #{record.content,jdbcType=LONGVARCHAR}");
        
        AdExample example = (AdExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("ad");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("create_date = #{record.createDate,jdbcType=TIMESTAMP}");
        sql.SET("modify_date = #{record.modifyDate,jdbcType=TIMESTAMP}");
        sql.SET("version = #{record.version,jdbcType=BIGINT}");
        sql.SET("orders = #{record.orders,jdbcType=INTEGER}");
        sql.SET("begin_date = #{record.beginDate,jdbcType=TIMESTAMP}");
        sql.SET("end_date = #{record.endDate,jdbcType=TIMESTAMP}");
        sql.SET("path = #{record.path,jdbcType=VARCHAR}");
        sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        sql.SET("type = #{record.type,jdbcType=INTEGER}");
        sql.SET("url = #{record.url,jdbcType=VARCHAR}");
        sql.SET("ad_position_id = #{record.adPositionId,jdbcType=BIGINT}");
        sql.SET("target_id = #{record.targetId,jdbcType=BIGINT}");
        sql.SET("param = #{record.param,jdbcType=VARCHAR}");
        
        AdExample example = (AdExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, AdExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}