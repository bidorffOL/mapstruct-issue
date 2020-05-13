package org.mapstruct.issue.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.issue.source.SourceA;
import org.mapstruct.issue.source.SourceB;
import org.mapstruct.issue.target.ImmutableTargetA;
import org.mapstruct.issue.target.ImmutableTargetB;

@Mapper
public interface TargetMapper {

  @Mapping(source = "name", target = "userName")
  ImmutableTargetA convert(SourceA source);

  @Mapping(source = "name", target = "userName")
  @Mapping(source = "address", target = "userAddress")
  ImmutableTargetB convert(SourceB source);

}
