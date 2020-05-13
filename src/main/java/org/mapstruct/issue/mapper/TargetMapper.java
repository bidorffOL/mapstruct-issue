package org.mapstruct.issue.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.issue.source.SourceA;
import org.mapstruct.issue.source.SourceB;
import org.mapstruct.issue.target.ImmutableTargetA;
import org.mapstruct.issue.target.ImmutableTargetB;
import org.mapstruct.issue.target.TargetA;
import org.mapstruct.issue.target.TargetB;

@Mapper
public interface TargetMapper {

  @BeanMapping(resultType = ImmutableTargetA.class)
  @Mapping(source = "name", target = "userName")
  TargetA convert(SourceA source);

  @BeanMapping(resultType = ImmutableTargetB.class)
  @InheritConfiguration
  @Mapping(source = "address", target = "userAddress")
  TargetB convert(SourceB source);

}
